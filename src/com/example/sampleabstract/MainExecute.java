package com.example.sampleabstract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainExecute {
    public static void main(String[] args) {
        FileItem fileItem = new FileItem("system");
        fileItem.print("out");
        
        List<AbstractItem> children = new ArrayList<>(Arrays.asList(
            new FileItem("matsumoto"),
            new FileItem("table")
        ));
        DirectoryItem directoryItem = new DirectoryItem("in", children);
        directoryItem.print("parent");
    }
}
