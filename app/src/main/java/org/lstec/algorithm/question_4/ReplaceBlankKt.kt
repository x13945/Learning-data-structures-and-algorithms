package org.lstec.algorithm.question_4

class ReplaceBlankKt {
    companion object {
        fun replaceSpace(s: String): String {
            // write code here
            var result = ""
            for (i in s) {
                if (i == ' ') {
                    result += "%20"
                } else {
                    result += i
                }
            }
            return result
        }
    }
}