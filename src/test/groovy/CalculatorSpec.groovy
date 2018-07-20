import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpec extends Specification {
    @Unroll
    def "verify add #a + #b = #c"(int a, int b, long c) {
        setup:
        def calc = new Calculator()

        expect:
        calc.add(a, b) == c

        where:
        a                 | b                 || c
        1                 | 2                 || 3
        5                 | -12               || -7
        Integer.MAX_VALUE | Integer.MAX_VALUE || Integer.MAX_VALUE * 2L
        0                 | 0                 || 0
    }
}