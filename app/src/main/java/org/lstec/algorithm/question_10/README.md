## 二进制中1的个数

## 题目

请实现一个函数,输入一个整数,输出该数二进制表示中1个数。例如把9表示成二进制是1001,有2位是1。因此如果输入9,该函数输出2。

## 思路

### 错误思路

在循环中把数字右移一位，判断最后一位是否是1。由于这时候的循环出口是判断右移后的数是否大于0.那么当输入一个负数的时候，它的最高位是1，右移后会在最左侧补0，导致无法跳出循环。

### 思路1：用另一个1来辅助位移

把`1`循环左移后与原数字相与，判断位移次数即可。循环出口是1左移到最左端时，会变成负数，进而跳出循环。

#### 缺点：由于循环出口是1位移到最左端，因此每个数都要位移32次才行

### 思路2: 用减法来降低循环次数

二进制的减法有个特别的地方，当我们把一个数字减去1之后，它最右侧的1会变成0，而那个1之后的每一位都和原先的数字相反，例如: `0b00100100 - 1 = 0b00100011`.

那么我们把这两个数相与，就可以在原先的数字上去掉最右侧的1，并把1后所有位设为0。那么循环的次数就和1个个数相同了。 


### 示例

代码在[这里](./FindOneInBinary.java)

单元测试在[这里](../../../test/java/question_10/FindOneInBinaryTest.java)