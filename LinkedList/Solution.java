class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3, temp3;
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val > list2.val){
            list3=temp3=list2;
            list2=list2.next;
            list3.next=null;
        }
        else{
            list3=temp3=list1;
            list1=list1.next;
            list3.next=null;
        }
        while(list1!=null && list2!=null){
            if(list1.val > list2.val){
                temp3.next=list2;
                temp3=temp3.next;
                list2=list2.next;
            }else{
                temp3.next=list1;
                temp3=temp3.next;
                list1=list1.next;
            }
        }
        if(list1==null){
            temp3.next=list2;

        } else{
            temp3.next=list1;
        }

        return list3;
    }
}

