class Solution {
    public String addBinary(String first, String second) {
        StringBuilder result = new StringBuilder();
        int indexA = first.length() - 1;
        int indexB = second.length() - 1;
        int carry = 0;

        while (indexA >= 0 || indexB >= 0 || carry == 1) {
            int sum = carry;

            if (indexA >= 0) {
                sum += first.charAt(indexA) - '0';
                indexA--;
            }

            if (indexB >= 0) {
                sum += second.charAt(indexB) - '0';
                indexB--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}
