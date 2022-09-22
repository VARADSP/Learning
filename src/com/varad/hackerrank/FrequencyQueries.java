package com.varad.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQueries {


     // Complete the freqQuery function below.
     static List<Integer> freqQuery(List<int[]> queries) {

        List<Integer> ans = new ArrayList<>();
        final int INSERT = 1;
        final int REMOVE = 2;
        final int QUERY = 3;

        HashMap<Integer,Integer> value2count = new HashMap<>();
        HashMap<Integer,Integer> count2countOccurance = new HashMap<>();

        for (int[] q: queries) {
            int type = q[0];
            int value = q[1];

            if (type == INSERT) {
                if (value2count.containsKey(value)) {
                    Integer oldCount = value2count.get(value);
                    Integer newCount = oldCount + 1;

                    value2count.put(value, newCount);

                    count2countOccurance.put(oldCount, count2countOccurance.get(oldCount) - 1);

                    if (!count2countOccurance.containsKey(newCount)) {
                        count2countOccurance.put(newCount, 0);
                    }
                    count2countOccurance.put(newCount, count2countOccurance.get(newCount) + 1);
                } else {
                    value2count.put(value, 1);
                    if (!count2countOccurance.containsKey(1)) {
                        count2countOccurance.put(1, 0);
                    }
                    count2countOccurance.put(1, count2countOccurance.get(1) + 1);
                }
            } else if (type == REMOVE) {
                if (value2count.containsKey(value)) {
                    int oldCount = value2count.get(value);
                    int newCount = Math.max(oldCount - 1, 0);

                    value2count.put(value, newCount);

                    count2countOccurance.put(oldCount, count2countOccurance.get(oldCount) - 1);

                    if (!count2countOccurance.containsKey(newCount)) {
                        count2countOccurance.put(newCount, 0);
                    }
                    count2countOccurance.put(newCount, count2countOccurance.get(newCount) + 1);
                }
            } else if (type == QUERY) {
                if (count2countOccurance.containsKey(value) && count2countOccurance.get(value) > 0) {
                    ans.add(1);
                } else {
                    ans.add(0);
                }
            }
        }

        return ans;

    }




    public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      int q = Integer.parseInt(bufferedReader.readLine().trim());
      List<int[]> queries = new ArrayList<>(q);
      Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
      for (int i = 0; i < q; i++) {
        int[] query = new int[2];
        Matcher m = p.matcher(bufferedReader.readLine());
        if (m.matches()) {
          query[0] = Integer.parseInt(m.group(1));
          query[1] = Integer.parseInt(m.group(2));
          queries.add(query);
        }
      }
      List<Integer> ans = freqQuery(queries);
      try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n");
      }
    }
  }
}
