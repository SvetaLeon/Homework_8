package homework8;

import java.util.*;

public class FileNavigator {
    Map<String, FileData> listFiles = new HashMap<>();

    public void add(String path, FileData newFileData) {
        if (path.equals(newFileData.getPath() + "/" + newFileData.getName())) {
            listFiles.put(path, newFileData);
        } else {
            System.out.println("The file " + newFileData.getName() +
                    " cannot be added because the key path and file path do not match");
        }
    }

    public void find(String path) {
        StringJoiner joiner = new StringJoiner(", ");
        System.out.print(path + " -> [");
        for (FileData result : listFiles.values()) {
            if (path.equals(result.getPath())) {
                joiner.add(result.toString());
            }
        }
        String myString = joiner.toString();
        System.out.println(myString + "]");
    }

    public void filterBySize(byte size) {
        StringJoiner joiner = new StringJoiner(", ");
        System.out.print("Files whose size does not exceed " + size + " byte -> [");
        for (FileData result : listFiles.values()) {
            if (result.getSize() < size) {
                joiner.add(result.toString());
            }
        }
        String myString = joiner.toString();
        System.out.println(myString + "]");
    }

    public void remove(String path) {
        List<String> value = new ArrayList<>();
        for (FileData result : listFiles.values()) {
            if (path.equals(result.getPath())) {
                value.add(result.getName());
            }
        }
        for (String nameFile : value) {
            listFiles.remove(path + "/" + nameFile);
        }
    }

    public void sortBySize() {
        StringJoiner joiner = new StringJoiner(", ");
        System.out.print("List of sorted files -> [");
        List<Map.Entry<String, FileData>> toSort = new ArrayList<>();
        for (Map.Entry<String, FileData> result : listFiles.entrySet()) {
            toSort.add(result);
        }
        toSort.sort(Map.Entry.<String, FileData>comparingByValue().reversed());
        for (Map.Entry<String, FileData> result : toSort) {
            FileData resultNameFile = result.getValue();
            joiner.add(resultNameFile.toString());
        }
        String myString = joiner.toString();
        System.out.println(myString + "]");
    }
}
