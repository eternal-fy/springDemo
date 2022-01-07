package com.ld;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Node{
  String m;

    public Node(String m) {
        this.m = m;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(m, node.m);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m);
    }

    @Override
    public String toString() {
        return "Node{" +
                "m='" + m + '\'' +",hashcode: "+this.hashCode()+
                '}';
    }
}
public class Lamda {
    public static void main(String[] args) throws IOException {
        File f=new File("d://x");
        FileInputStream fileInputStream=new FileInputStream(f);




    }

}
