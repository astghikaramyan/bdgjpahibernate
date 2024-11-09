//package vmwarechallengeproblems;
//
///**
// * Created by User on 24.09.2020.
// */
//    public class P1 {
//
//        // Complete the sockMerchant function below.
//        static int sockMerchant(int n, int[] ar) {
//            Integer count = 0;
//            int sum = 0;
//            Map<Integer, Integer> map = new HashMap<>();
//            for(int i = 0; i < ar.length; i++){
//                if(map.containsKey(Integer.valueOf(ar[i]))){
//                    count = map.get(ar[i]);
//                    count++;
//                    map.put(ar[i], count);
//                }else{
//                    map.put(Integer.valueOf(ar[i]), 1);
//                }
//            }
//            for(Map.Entry mp : map.entrySet()){
//                Integer val = (Integer)mp.getValue();
//                val = val/2;
//                sum += val.intValue();
//            }
//            return sum;
//        }
//
//        private static final Scanner scanner = new Scanner(System.in);
//
//        public static void main(String[] args) throws IOException {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] ar = new int[n];
//
//            String[] arItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int arItem = Integer.parseInt(arItems[i]);
//                ar[i] = arItem;
//            }
//
//            int result = sockMerchant(n, ar);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();
//
//            scanner.close();
//        }
//}
