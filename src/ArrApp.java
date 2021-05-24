public class ArrApp {
        /*
            method find index of first occurence of given number using binary search.
            if element not found then returns -1
            */
        public static int firstIndexOf(int[] arr, int x) {
            //pos holds index of first occurnce of given number
            int pos = -1;
            //begin holds startin index
            //last holds last index
            //mid holds mid index
            int begin = 0;
            int last = arr.length;
            int mid = 0;
            while (begin <= last) {
                mid = (begin + last) / 2;
                if (arr[mid] == x) {
                    pos = mid;
                    last = mid - 1;
                } else if (x < arr[mid]) {
                    last = mid - 1;
                } else {
                    begin = mid + 1;
                }
            }
            return pos;
        }
        /*
            method find index of last occurence of given number using binary search.
            if element not found then returns -1
            */
        public static int lastIndexOf(int[] arr, int x) {
            //pos holds index of last occurnce of given number
            int pos = -1;
            //begin holds startin index
            //last holds last index
            //mid holds mid index

            int begin = 0;
            int last = arr.length;
            int mid = 0;
            while (begin <= last) {
                mid = (begin + last) / 2;
                if (arr[mid] == x) {
                    pos = mid;
                    begin = mid + 1;
                } else if (x < arr[mid]) {
                    last = mid - 1;
                } else {
                    begin = mid + 1;
                }
            }
            return pos;
        }
        /*
            method find index of second occurence of given number using binary search.
            if second occurence does not exist returns -1
            */
        public static int secondIndexOf(int[] arr, int x) {
            int pos = firstIndexOf(arr, x);
            if (arr[pos + 1] == x) {
                return pos + 1;
            } else {
                return -1;
            }
        }

        public static void main(String args[]) {
            int arr[] = {1, 3, 5, 5, 7, 8, 8, 8, 9, 11, 12, 12,15};
            System.out.println(" First index of 8 in array is:"+firstIndexOf(arr, 8));
            System.out.println(" Second index of 8 in array is:"+secondIndexOf(arr, 8));
            System.out.println(" Second index of 8 in array is:"+lastIndexOf(arr, 8));
            System.out.println("Array have two elements with given sum:23 "+has(arr, 23));
            System.out.println("Array have two elements with given sum:23 "+hasTriple(arr, 35));
        }
        /*
            method returns boolean value whehter array have two elements with given sum
            */
        public static boolean has(int[] arr, int num) {
            int left, right;
            left = 0;
            right = arr.length - 1;
            while (left < right) {
                if (arr[left] + arr[right] == num) {
                    return true;
                } else if (arr[left] + arr[right] < num) {
                    left++;
                } else {
                    right--;
                }
            }
            return false;
        }
        /*
            method returns boolean value whehter array have three elements with given sum
            */
        public static boolean hasTriple(int[] arr, int num) {
            int left, right;
            for (int i = 0; i < arr.length; i++) {
                int firstNum = arr[i];
                int sum = num - firstNum;
                left = i + 1;
                right = arr.length - 1;
                while (left < right) {
                    if (arr[left] + arr[right] == sum) {
                        return true;
                    } else if (arr[left] + arr[right] < num) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return false;
        }
    }

