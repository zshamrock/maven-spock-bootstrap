package com.akazlou

import spock.lang.Specification
import spock.lang.Unroll

class MathSpec extends Specification {
    @Unroll
    def "#a + #b = #c"(int a, int b, int c) {
        expect:
        a + b == c

        where:
        a  | b  || c
        1  | 2  || 3
        10 | -4 || 6
    }
}
