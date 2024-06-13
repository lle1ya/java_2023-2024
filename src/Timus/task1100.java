package Timus;
import java.util.*;
public class task1100 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            List<int[]> teams = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int teamId = scanner.nextInt();
                int solvedTasks = scanner.nextInt();
                teams.add(new int[]{teamId, solvedTasks});
            }

            Collections.sort(teams, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o2[1], o1[1]);
                }
            });

            for (int[] team : teams) {
                System.out.println(team[0] + " " + team[1]);
            }
        }
    }
