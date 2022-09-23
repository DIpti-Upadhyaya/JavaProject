package src.arraytype;
public class ElementIndex {
    // Java program to find index of  element elements
        public static int findIndex(int arr[], int t) {
            {
                // if array is Null
                if (arr == null) {
                    return -1;
                }
                // find length of array
                int len = arr.length;
                int i = 0;
                while (i < len) {
                    // if the position of element is t
                    // then return the index
                    if (arr[i] == t) {
                        return i;
                    }
                    else {
                        i = i + 1;
                    }
                }
                return -1;
            }
                    }
            public static void main(String[] args)
            {
                int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

                // find the index of 1
                System.out.println("Index position of 1 is: "
                        + findIndex(my_array, 1));

                // find the index of 6
                System.out.println("Index position of 6 is: "
                        + findIndex(my_array, 6));
            }
        }

