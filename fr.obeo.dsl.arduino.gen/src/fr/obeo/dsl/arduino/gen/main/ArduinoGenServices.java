package fr.obeo.dsl.arduino.gen.main;

import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.MathOperator;
import fr.obeo.dsl.arduino.OperatorKind;
import fr.obeo.dsl.arduino.Repeat;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.Value;
import fr.obeo.dsl.arduino.Variable;

public class ArduinoGenServices {

	public int getRepeatInstructionIndex(Repeat repeat) {
		Sketch sketch = (Sketch) repeat.eContainer();
		for (int i = 0; i < sketch.getInstructions().size(); i++) {
			Instruction instruction = sketch.getInstructions().get(i);
			if (instruction instanceof Repeat && instruction.equals(repeat)) {
				return i;
			}
		}

		return 0;
	}

	public String getValue(Value value) {
		if (value instanceof Variable) {
			return ((Variable) value).getName();
		}
		if (value instanceof Constant) {
			return value.getValue();
		}
		if (value instanceof MathOperator) {
			return "(" + getValue(((MathOperator) value).getLeft())
					+ getOperator(((MathOperator) value).getOperator())
					+ getValue(((MathOperator) value).getRight()) + ")";
		}
		return null;
	}

	private String getOperator(OperatorKind operator) {
		switch (operator) {
		case AND:
			return "&";
		case DIFF:
			return "!=";
		case DIV:
			return "/";
		case EQUAL:
			return "=";
		case LOWER:
			return "<";
		case LOWER_OR_EQUAL:
			return "<=";
		case MAX:
			return "max";
		case MIN:
			return "min";
		case MINUS:
			return "-";
		case MUL:
			return "*";
		case NOT:
			return "not";
		case OR:
			return "or";
		case PLUS:
			return "+";
		case POURCENT:
			return "%";
		case UPPER:
			return ">";
		case UPPER_OR_EQUAL:
			return ">=";
		}
		return null;
	}

}