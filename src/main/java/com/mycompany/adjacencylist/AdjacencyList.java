/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adjacencylist;

/**
 *
 * @author Erika
 */
import java.util.*;
public class AdjacencyList {

    public static void main(String[] args) {
        Map<Character, List<Character>> adjacencyList = new HashMap<>();
        adjacencyList.put('a', new ArrayList<>(Arrays.asList('b')));
        adjacencyList.put('b', new ArrayList<>(Arrays.asList('a', 'c', 'e')));
        adjacencyList.put('c', new ArrayList<>(Arrays.asList('b', 'd', 'f')));
        adjacencyList.put('d', new ArrayList<>(Arrays.asList( 'c')));
        adjacencyList.put('e', new ArrayList<>(Arrays.asList( 'b', 'f')));
        adjacencyList.put('f', new ArrayList<>(Arrays.asList('c', 'e')));
        
        //to print adjacency list
        for (Map.Entry<Character, List<Character>> entry : adjacencyList.entrySet()){
          System.out.print(entry.getKey() + ": [");
          StringBuilder output = new StringBuilder();
          for(Character vertex : entry.getValue()){
              output.append(vertex).append (",");
          }
          if (!entry.getValue().isEmpty()){
              output.delete(output.length() - 1, output.length());
          }
          System.out.print(output);
          System.out.println("]");
        }
    }
}