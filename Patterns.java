// 1.Print the pattern
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 4;
// int m = 5;

// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop
// for (int j = 1; j <= m; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// 2.
// * * * * *
// * *
// * *
// * * * * *

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 4;
// int m = 5;

// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop
// for (int j = 1; j <= m; j++) {
// // cell ---> (i,j)
// if (i == 1 || j == 1 || i == n || j == m) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 3. Half Pyramid
// *
// * *
// * * *
// * * * *

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 4;

// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// 4. Inverted Half Pyramid
// * * * *
// * * *
// * *
// *

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 4;

// // outer loop
// for (int i = n; i >= 1; i--) {
// // inner loop
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// 5. Inverted Half Pyramid (rotated by 180 deg)

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 4;

// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop ---> print space
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // inner loop ---> print star
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// 6. Half Pyramid with Numbers

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 5;

// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// 7. Inverted Half Pyramid with Numbers

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 5;

// // outer loop
// for (int i = n; i >= 1; i--) {
// // inner loop
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// 8. Floyd's Triangle

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 5;
// int number = 1;

// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop
// for (int j = 1; j <= i; j++) {
// System.out.print(number + " ");
// number++;
// }
// System.out.println();
// }
// }
// }

// 9. 0-1 Triangle

// import java.util.*;

// public class Patterns {
// public static void main(String args[]) {
// int n = 5;
// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop
// for (int j = 1; j <= i; j++) {
// int sum = i + j;
// if (sum % 2 == 0) { // even
// System.out.print("1" + " ");

// } else {
// System.out.print("0" + " ");
// }
// }
// System.out.println();
// }
// }
// }