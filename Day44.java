class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0;
        int high = 0;

        for(int w : weights) {
            low = Math.max(low, w); // minimum possible capacity
            high += w;              // maximum possible capacity
        }

        while(low < high) {
            int mid = low + (high - low) / 2;

            if(canShip(weights, days, mid)) {
                high = mid; // capacity possible hai, aur chhoti try karni hai
            }
            else {
                low = mid + 1; // capacity chhoti hai, badhani padegi
            }
        }

        return low;
    }

    public boolean canShip(int[] weights, int days, int capacity) {
        int day = 1;
        int load = 0;

        for(int w : weights) {

            if(load + w > capacity) {
                day++;
                load = 0;
            }

            load += w;
        }

        return day <= days;
    }
}