class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1; // количество уникальных элементов
        for (int i = 1; i < nums.length; i++) {
            // Если текущий элемент отличается от предыдущего уникального
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // перемещаем уникальный элемент на позицию k
                k++; // увеличиваем счетчик уникальных элементов
            }
        }
        return k;
    }
}