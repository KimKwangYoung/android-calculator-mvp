package edu.nextstep.camp.calculator.main

import edu.nextstep.camp.calculator.domain.Operator

interface MainContract {
    interface View {
        fun showExpression(expression: String)
        fun showResult(result: Int?)
    }

    interface Presenter {
        fun addOperand(operand: Int)
        fun addOperator(operator: Operator)
        fun removeLast()
        fun expressionCalculate()
    }
}