import java.util.*;

class ClassPhotos {

    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        boolean redFront = false;
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        if (redShirtHeights.get(redShirtHeights.size() - 1) < blueShirtHeights.get(blueShirtHeights.size() - 1)) {
            redFront = true;
        } else if (redShirtHeights.get(redShirtHeights.size() - 1) > blueShirtHeights
                .get(blueShirtHeights.size() - 1)) {
            redFront = false;
        } else {
            return false;
        }
        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (redFront == true) {
                if (redShirtHeights.get(i) >= blueShirtHeights.get(i)) {
                    return false;
                }
            } else {
                if (redShirtHeights.get(i) <= blueShirtHeights.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}