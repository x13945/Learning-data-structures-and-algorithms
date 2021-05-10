package org.lstec.algorithm.question_6

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class ConstructBinaryTreeKt {
    companion object {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param pre int整型一维数组
         * @param vin int整型一维数组
         * @return TreeNode类
         */
        fun reConstructBinaryTree(pre: IntArray, vin: IntArray): TreeNode? {
            // write code here
            if (pre.size != vin.size) {
                return null;
            } else {
                return reConstructBinaryTreeImpl(pre, 0, pre.size - 1, vin, 0, vin.size - 1)
            }
        }

        private fun reConstructBinaryTreeImpl(
            pre: IntArray,
            startPreOrder: Int,
            endPreOrder: Int,
            vin: IntArray,
            startVinOrder: Int,
            endVinOrder: Int
        ): TreeNode? {

            val rootValue = pre[startPreOrder]
            val rootNode = TreeNode(rootValue)

            var rootNodeIndexVin = 0
            for (i in startVinOrder..endVinOrder){
                if (vin[i] == rootValue){
                    rootNodeIndexVin = i
                    break;
                }
            }

            val leftLength = rootNodeIndexVin - startVinOrder
            return null
        }
    }
}