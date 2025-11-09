class Solution {
    public int[] twoSum(int[] nums, int target) {
        // создаем хэш-таблицу для хранения чисел и их индексов
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // проверяем, есть ли complement в хэш-таблице
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            
            // добавляем текущее число и его индекс в хэш-таблицу
            numMap.put(nums[i], i);
        }
        
        // по условию всегда есть решение, поэтому эта строка никогда не выполнится
        return new int[] {};
    }
}