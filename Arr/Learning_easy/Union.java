import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {
    
    public static void main(String[] args) {


        // =================================
        // ===== UNION BRUITE SOULITON =====
        // =================================
        int arr1[]={2,3,4,5};
        int arr2[]={2,3,4,5,6,7,8};

        Set<Integer> st = new HashSet<>();

        for(int i : arr1){
            st.add(i);
        }
        for(int i : arr2){
            st.add(i);
        }

        int Union[] = new int[st.size()];
        int j=0;
        for(int i : st){
            Union[j]=i;
            j++;
        }

        // System.out.println(Arrays.toString(Union));


        // ==========================
        // ===== UNION OPTIMAL  =====
        // ==========================

        int low = 0;
        int high =0;
        int nums1[]={1,1,2,3,4,5};
        int nums2[]={2,3,4,4,5,6,6,7};

        ArrayList<Integer> list = new ArrayList<>();

        while(low<nums1.length && high<nums2.length){
            if(nums1[low]<nums2[high]){
                list.add(nums1[low]);
            }
        }

    }
}
