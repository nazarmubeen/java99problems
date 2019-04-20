package com.java.concepts.eight;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollections {

	public static void main(String[] args)
	{
		StreamToCollections st=new StreamToCollections();
		Actor mysteryMen=st.new Actor();
		
		//creating list
		List<String> superHeroes =
			    Stream.of("Mr. Furious", "The Blue Raja", "The Shoveler",
			              "The Bowler", "Invisible Boy", "The Spleen", "The Sphinx")
			          .collect(Collectors.toList());
		
		//creating a set
		Set<String> villains =
			    Stream.of("Casanova Frankenstein", "The Disco Boys",
			              "The Not-So-Goodie Mob", "The Suits", "The Suzies",
			              "The Furriers", "The Furriers")
			          .collect(Collectors.toSet());
		
		//creating a linked List
		List<String> actors =
			    Stream.of("Hank Azaria", "Janeane Garofalo", "William H. Macy",
			              "Paul Reubens", "Ben Stiller", "Kel Mitchell", "Wes Studi")
			          .collect(Collectors.toCollection(LinkedList::new));
		
		//create array of strings
		String[] wannabes =
			    Stream.of("The Waffler", "Reverse Psychologist", "PMS Avenger")
			          .toArray(String[]::new);	
		
		
		//creating  maps
		Set<Actor> actorss= mysteryMen.getActors();

		Map<String, String> actorMap = actorss.stream()
		    .collect(Collectors.toMap(Actor::getName, Actor::getRole)); 

		actorMap.forEach((key,value) ->
		    System.out.printf("%s played %s%n", key, value));
		
	}
		
	class Actor {
		String name;
		String role;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
		
		public Actor(String name, String role) {
			super();
			this.name = name;
			this.role = role;
		}
		
		public Actor()
		{
			
		}
		
		Set<Actor> getActors()
		{
			HashSet<Actor> set=new HashSet<Actor>();
			set.add(new Actor("raju","hero"));
			set.add(new Actor("rani","heroin"));
			return set;
		}
	}
}
