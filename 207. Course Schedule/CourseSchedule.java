import java.util.*;

class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> canDo = new HashSet<>();
        Set<Integer> wantToDo = new HashSet<>();
        Map<Integer, List<Integer>> mappedPreReq = new HashMap<>();
        for(int[] preReq : prerequisites) {
            if (!mappedPreReq.containsKey(preReq[0]))  mappedPreReq.put(preReq[0], new ArrayList<>());
            mappedPreReq.get(preReq[0]).add(preReq[1]);
        }

        for(Integer key : mappedPreReq.keySet()) {
            if(!checkCanDo(key, mappedPreReq, canDo, wantToDo)) return false;
        }
        return true;
    }

    private boolean checkCanDo(Integer key, Map<Integer, List<Integer>> mappedPreReq, Set<Integer> canDo, Set<Integer> wantToDo) {
        if(!mappedPreReq.containsKey(key)) canDo.add(key);
        if(canDo.contains(key)) {
            wantToDo.add(key);
            return true;
        }
        if(wantToDo.contains(key)) return false;
        wantToDo.add(key);

        for(Integer keyToCheck : mappedPreReq.get(key)) {
            if(!checkCanDo(keyToCheck, mappedPreReq, canDo, wantToDo)) return false;
        }
        canDo.add(key);
        return true;
    }
}