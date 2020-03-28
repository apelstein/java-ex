import static java.lang.Math.ceil;
import static java.lang.Math.round;

import java.util.*;

public class Main {

    public static void main(String args[]){
        Node node = new Node(5);
        if(node.getNext() == null){
            System.out.println("hi");
        }

        LinkedList list = new LinkedList();
        for(int i = 0; i < 10; i++){
            Node node2 = new Node(i);
            list.insertAt(node2,0);
        }

        System.out.println(list);
        for(int i=0; i<10; i++){
            list.removeAtIdex(0);
        }
        System.out.println(list);

        System.out.println("----------------------------------------");
        Solution.ListNode listNode = new Solution.ListNode(1);
        listNode.next = new Solution.ListNode(4);
        listNode.next.next = new Solution.ListNode(2);

        System.out.println(listNode);
        Solution sol = new Solution();
        sol.insertionSortList(listNode);
        System.out.println(listNode);

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        Permutation.printPermutations(ints);

        StringBuilder sb = new StringBuilder();
        sb.append("aa");
        sb.append("bb");
        sb.append("cc");
        sb.insert(3,"dd");
        System.out.println(sb.toString());
        System.out.println(ceil(1.14));

        Inherit in = new Inherit();

        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("Gilad ");
        myStringBuilder.append("Lola ");
        System.out.println(myStringBuilder.toString());
        myStringBuilder.append("Apelstein");
        System.out.println(myStringBuilder.toString());
        myStringBuilder.setLength(40);
        System.out.println(myStringBuilder.toString());
        myStringBuilder.append("Shir Itay Zoei");
        System.out.println(myStringBuilder.toString());
        myStringBuilder.setLength(3);
        System.out.println(myStringBuilder);
        char c[] = {'a','b','c'};
        System.out.println(c);
        Cracking cracking = new CrackingV1();
        System.out.println(cracking.isAllUnique("abcde"));
        System.out.println(cracking.isAllUnique("abade"));
        System.out.println(cracking.isAllUnique("zz"));


        Map<Integer, Integer> map = new HashMap<>();
        map.put(5,5);

        Solution.ListNode base = new Solution.ListNode(3);
        base.next = new Solution.ListNode(2);
        base.next.next = new Solution.ListNode(1);
        base.next.next.next = new Solution.ListNode(12);
        System.out.println(base);

        System.out.println(sol.sortList(base));

        Solution2 sol2 = new Solution2();
        System.out.println(sol2.solution(53,1953786));
        System.out.println(sol2.solution(78,1953708678));
        System.out.println(sol2.solution(57,15378678));
        System.out.println(sol2.solution(0,0));
        System.out.println(sol2.solution(1,0));
        System.out.println(sol2.solution(1,21));
        System.out.println(sol2.solution(2134552341,2134552341));
        System.out.println("----------------");
//        System.out.println(sol2.solution(-1,21));
        int[] arr = {1};
        System.out.println(sol2.solution2(arr));
        System.out.println("##################################");
        System.out.println(N3.repeatedNumber(Arrays.asList(1000545, 1000038, 1000647, 1000038, 1000562, 1000038, 1000586, 1000487, 1000951, 1000226, 1000038, 1000145, 1000038, 1000761, 1000196, 1000038, 1000821, 1000829, 1000038, 1000570, 1000846, 1000038, 1000178, 1001000, 1000038, 1000568, 1000278, 1000734, 1000048, 1000038, 1000002, 1000271, 1000388, 1000315, 1000816, 1000038, 1000038, 1000846, 1000305, 1000853, 1000383, 1000116, 1000797, 1000279, 1000038, 1000038, 1000049, 1000108, 1000789, 1000240, 1000201, 1000506, 1000429, 1000857, 1000649, 1000898, 1000211, 1000000, 1000178, 1000038, 1000569, 1000695, 1000451, 1000159, 1000038, 1000038, 1000038, 1000129, 1000038, 1000038, 1000904, 1000038, 1000038, 1000902, 1000525, 1000038, 1000166, 1000038, 1000765, 1000038, 1000561, 1000417, 1000523, 1000668, 1000296, 1000038, 1000038, 1000038, 1000461, 1000654, 1000924, 1000985, 1000038, 1000426, 1000038, 1000038, 1000038, 1000904, 1000775, 1000148, 1000961, 1000038, 1000038, 1000038, 1000833, 1000332, 1000038, 1000038, 1000512, 1000322, 1000592, 1000524, 1000788, 1000057, 1000497, 1000625, 1000599, 1000484, 1000038, 1000747, 1000457, 1000111, 1000038, 1000038, 1000493, 1000287, 1000007, 1000695, 1000344, 1000098, 1000038, 1000191, 1000038, 1000576, 1000481, 1000488, 1000199, 1000038, 1000663, 1000176, 1000038, 1000521, 1000721, 1000728, 1000247, 1000038, 1000038, 1000460, 1000644, 1000038, 1000497, 1000966, 1000431, 1000038, 1000975, 1000063, 1000580, 1000669, 1000038, 1000038, 1000492, 1000038, 1000038, 1000529, 1000553, 1000333, 1000038, 1000341, 1000569, 1000862, 1000017, 1000532, 1000571, 1000508, 1000402, 1000285, 1000611, 1000210, 1000646, 1000110, 1000038, 1000553, 1000273, 1000729, 1000038, 1000038, 1000720, 1000400, 1000038, 1000983, 1000038, 1000766, 1000038, 1000180, 1000494, 1000765, 1000136, 1000038, 1000029, 1000246, 1000991, 1000038, 1000759, 1000038, 1000038, 1000045, 1000038, 1000648, 1000038, 1000038, 1000694, 1000914, 1000990, 1000038, 1000038, 1000758, 1000435, 1000038, 1000554, 1000038, 1000452, 1000156, 1000038, 1000322, 1000828, 1000868, 1000038, 1000973, 1000991, 1000464, 1000294, 1000633, 1000038, 1000582, 1000229, 1000285, 1000038, 1000038, 1000086, 1000038, 1000989, 1000038, 1000038, 1000157, 1000307, 1000369, 1000300, 1000038, 1000038, 1000038, 1000244, 1000038, 1000038, 1000222, 1000458, 1000038, 1000523, 1000434, 1000316, 1000038, 1000256, 1000038, 1000695, 1000038, 1000469)));

        Palindrom pal = new Palindrom();
        if(pal.isPalindrom("asd")){
            System.out.println("oh no");
        }
        if(pal.isPalindrom("asdadxxasba")){
            System.out.println("oh yes");
        }

        int[][] mat = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20}, {21,22,23,24,25}};
        RotMatrix rotMatrix = new RotMatrix();
        rotMatrix.printMat(mat);
        System.out.println("");
//        rotMatrix.printMat(rotMatrix.rotate(mat));
//        System.out.println("");
        rotMatrix.rotateInPlace(mat);
        rotMatrix.printMat(mat);
        System.out.println("");
        rotMatrix.rotateInPlace(mat);
        rotMatrix.printMat(mat);
        System.out.println("");
        rotMatrix.rotateInPlace(mat);
        rotMatrix.printMat(mat);
        System.out.println("");
        rotMatrix.rotateInPlace(mat);
        rotMatrix.printMat(mat);
        System.out.println("");

        int elemHamDis = elemHamDis(4, 6);
        System.out.println(elemHamDis);

        System.out.println(4^2);
        ArrayList<Integer> arrs = new ArrayList<>(Arrays.asList(1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3 ));

        Solution s1 = new Solution();
        s1.threeSum(arrs);
        System.out.println("-------------");
        TreeNode treeNode = new TreeNode(11);
        for(int k = 5; k != 4; k = (k+1)%10){
            MyTree.insert(treeNode, k);
        }
        MyTree.visitInOrder(treeNode);
        System.out.println("-------------------------------");
        MyTree.bfsVisit(treeNode);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");


        Graph<String> graph = new Graph<String>();
        graph.addVertex("gilad");
        graph.addVertex("Itay");
        System.out.println(graph);
        graph.addEdge("gilad","Itay");
        graph.addVertex("Shir");
        graph.addEdge("gilad", "Shir");
        System.out.println(graph);

        Graph<String> dirGraph = new DirGraph<>();
        dirGraph.addVertex("a");
        dirGraph.addVertex("d");
        dirGraph.addVertex("b");
        dirGraph.addEdge("a","b");
        dirGraph.addEdge("a","d");
        System.out.println(dirGraph);

        System.out.println(((DirGraph<String>) dirGraph).getInVertices("d"));


    }

    public static int elemHamDis(int a, int b){
        if(a == 0 && b == 0){
            return 0;
        }
        int aLastBit = a%2;
        int bLastBit = b%2;
        int res = aLastBit^bLastBit;
        int rec = elemHamDis(a/2, b/2);
        return rec + res;
    }
}
