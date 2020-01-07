package Day2;

public class Solution2Part2 {
    public static void main(String[] args) {


        for (int k = 0; k < 100; k++) {
            for (int j = 0; j < 100; j++) {

                int[] program = {
                        1, 0, 0, 3,
                        1, 1, 2, 3,
                        1, 3, 4, 3,
                        1, 5, 0, 3,
                        2, 6, 1, 19,
                        1, 5, 19, 23,
                        2, 6, 23, 27,
                        1, 27, 5, 31,
                        2, 9, 31, 35,
                        1, 5, 35, 39,
                        2, 6, 39, 43,
                        2, 6, 43, 47,
                        1, 5, 47, 51,
                        2, 9, 51, 55,
                        1, 5, 55, 59,
                        1, 10, 59, 63,
                        1, 63, 6, 67,
                        1, 9, 67, 71,
                        1, 71, 6, 75,
                        1, 75, 13, 79,
                        2, 79, 13, 83,
                        2, 9, 83, 87,
                        1, 87, 5, 91,
                        1, 9, 91, 95,
                        2, 10, 95, 99,
                        1, 5, 99, 103,
                        1, 103, 9, 107,
                        1, 13, 107, 111,
                        2, 111, 10, 115,
                        1, 115, 5, 119,
                        2, 13, 119, 123,
                        1, 9, 123, 127,
                        1, 5, 127, 131,
                        2, 131, 6, 135,
                        1, 135, 5, 139,
                        1, 139, 6, 143,
                        1, 143, 6, 147,
                        1, 2, 147, 151,
                        1, 151, 5, 0, 99,
                        2, 14, 0, 0};

                for (int i = 0; i < program.length; i += 4) {

                    program[1] = k;
                    program[2] = j;

                    int opcode = program[i];
                    int firstOp = program[i + 1];
                    int secondOp = program[i + 2];
                    int resultPlace = program[i + 3];
                    if (opcode == 1) {
                        program[resultPlace] = program[firstOp] + program[secondOp];
                    } else if (opcode == 2) {
                        program[resultPlace] = program[firstOp] * program[secondOp];
                    } else if (program[i] == 99) {
                        break;
                    }
                }
                int result = program[0];
                if (result == 19690720)
                    System.out.println(k + "" + j);
            }
        }
    }
}



