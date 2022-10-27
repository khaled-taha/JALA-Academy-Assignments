
// 8. Write a function to find the minimum and maximum value of an array

    public static void main(String[] args) {

        int[] array = {-1,-2,-3,-4,-5, 6};
        findMaxAndMin(array);

    }

    public static void findMaxAndMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            if(i > max) max = i;
            if(i < min) min = i;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }


}
