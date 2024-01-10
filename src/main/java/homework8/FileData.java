package homework8;

public class FileData implements Comparable<FileData> {
    private final String name;
    private final byte size;
    private final String path;

    public String getName() {
        return name;
    }

    public byte getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    public FileData(String name, byte size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        FileData fileData = (FileData) obj;
        return size == fileData.size
                && (name == fileData.name || (name != null && name.equals(fileData.getName())))
                && (path == fileData.path || (path != null && path.equals(fileData.getPath())));
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(FileData o) {
        return o.getSize() - this.getSize();
    }
}

