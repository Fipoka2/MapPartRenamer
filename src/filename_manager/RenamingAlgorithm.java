package filename_manager;

import javafx.util.Pair;


public class RenamingAlgorithm {

    private int beginIndex;

    private int endIndex;

    private int mapLength;

    public String getNewName(String oldName)
    {
        return "map-part-" + (getPosition(getIndex(oldName))).getKey() +
                "-" +  (getPosition(getIndex(oldName))).getValue() + ".jpg";
    }

    private int getIndex(String oldName)
    {
        return (Integer.parseInt(oldName.substring(beginIndex, endIndex))-1);
    }

    private Pair<Integer,Integer> getPosition(int index)
    {
        int a = index / mapLength;
        int b = index % mapLength;
         return new Pair<Integer, Integer>(a,b);
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getMapLength() {
        return mapLength;
    }

    public void setMapLength(int mapLength) {
        this.mapLength = mapLength;
    }

    public RenamingAlgorithm(int beginIndex, int endIndex, int mapLength) {
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
        this.mapLength = mapLength;
    }
}
