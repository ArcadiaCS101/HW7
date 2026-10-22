package cs101;

import java.util.Scanner;

public class BandStrings {

	// QUESTION A: Track Title Analyzer
	//
	// STRING FUNCTION TO USE: .length() and .charAt(int index)
	// - .length() takes NO parameters and returns the int total character count.
	// Example: "Rock".length() returns 4.
	// - .charAt(int index) takes an int index (0 to length - 1) and returns the
	// char at that position.
	// Example: "Rock".charAt(0) returns 'R'.
	//
	// YOUR ASSIGNMENT:
	// Write a static method named question_a that takes a String parameter
	// `songTitle`.
	// Print the string's length, first character, and last character in the format:
	// Song Title Length: <length>
	// First Character: <char>
	// Last Character: <char>
	// Edge Case: If songTitle is null or empty, print "Error: Song title is empty
	// or null."
	public static void question_a(String songTitle) {
		// TODO: Implement question_a
	}

	// QUESTION B: Setlist Search
	//
	// STRING FUNCTION TO USE: .indexOf(char ch) or .indexOf(String str)
	// - Takes a char (or String) parameter representing the target to search for.
	// - Returns an int representing the zero-based index of the FIRST occurrence.
	// - Returns -1 if the target is NOT found in the string.
	// Example: "Madison".indexOf('d') returns 2. "Madison".indexOf('z') returns -1.
	//
	// YOUR ASSIGNMENT:
	// Write a static method named question_b that takes a String `venueName` and a
	// char `target`.
	// Use .indexOf() to search for `target` in `venueName`.
	// If found, print "Character '<target>' found at index: <index>"
	// If not found (-1), print "Character '<target>' was not found in venue name."
	public static void question_b(String venueName, char target) {
		// TODO: Implement question_b
	}

	// QUESTION C: Album Tag Generator
	//
	// STRING FUNCTIONS TO USE: .replace(CharSequence target, CharSequence
	// replacement) and .toUpperCase()
	// - .replace(target, replacement) takes two String/char parameters and returns
	// a new String
	// with all instances of target swapped for replacement.
	// Example: "hip hop".replace(" ", "") returns "hiphop".
	// - .toUpperCase() takes NO parameters and returns a new String with all
	// letters capitalized.
	// Example: "hiphop".toUpperCase() returns "HIPHOP".
	//
	// YOUR ASSIGNMENT:
	// Write a static method named question_c that takes a String `description` and
	// RETURNS a String.
	// Remove all spaces (" ") from `description`, convert all characters to
	// uppercase, and return the result.
	public static String question_c(String description) {
		// TODO: Implement question_c
		return "";
	}

	// QUESTION D: Lyric / Teaser Extract
	//
	// STRING FUNCTION TO USE: .substring(int beginIndex, int endIndex)
	// - Takes two int parameters: `beginIndex` (inclusive start) and `endIndex`
	// (exclusive end).
	// - Returns a new String containing the characters from `beginIndex` up to
	// `endIndex - 1`.
	// Example: "Concert".substring(0, 3) returns "Con".
	//
	// YOUR ASSIGNMENT:
	// Write a static method named question_d that takes a String `text`, an int
	// `start`, and an int `end`.
	// Check that `start` and `end` are valid indices (start >= 0, end <= length,
	// start < end).
	// If valid, print the extracted substring directly (e.g., "Smooth").
	// Otherwise, print "Error: Invalid start (<start>) or end (<end>) index."
	public static void question_d(String text, int start, int end) {
		// TODO: Implement question_d
	}

	// MAIN METHOD:
	// Test each of your static methods here by calling them with different inputs.
	// Each test prints both the Expected Output and the Actual Output.
	public static void main(String[] args) {
		System.out.println("Testing Question A: Track Title Analyzer");
		System.out.println("Test 1 Input: \"Bohemian Rhapsody\"");
		System.out.println("Expected:\nSong Title Length: 17\nFirst Character: B\nLast Character: y");
		System.out.println("Actual:");
		question_a("Bohemian Rhapsody");

		System.out.println("\nTest 2 Input: \"RED\"");
		System.out.println("Expected:\nSong Title Length: 3\nFirst Character: R\nLast Character: D");
		System.out.println("Actual:");
		question_a("RED");

		System.out.println("\nTesting Question B: Setlist Search");
		System.out.println("Test 1 Input: \"Madison Square Garden\", target: 'S'");
		System.out.println("Expected: Character 'S' found at index: 8");
		System.out.println("Actual:");
		question_b("Madison Square Garden", 'S');

		System.out.println("\nTest 2 Input: \"Red Rocks Amphitheatre\", target: 'z'");
		System.out.println("Expected: Character 'z' was not found in venue name.");
		System.out.println("Actual:");
		question_b("Red Rocks Amphitheatre", 'z');

		System.out.println("\nTesting Question C: Album Tag Generator");
		System.out.println("Test 1 Input: \"heavy metal concert\"");
		System.out.println("Expected: HEAVYMETALCONCERT");
		System.out.println("Actual:   " + question_c("heavy metal concert"));

		System.out.println("\nTest 2 Input: \"lo fi chill beats\"");
		System.out.println("Expected: LOFICHILLBEATS");
		System.out.println("Actual:   " + question_c("lo fi chill beats"));

		System.out.println("\nTesting Question D: Lyric Snippet");
		System.out.println("Test 1 (Valid) Input: \"Santana - Smooth\", 10 to 16");
		System.out.println("Expected: Smooth");
		System.out.println("Actual:");
		question_d("Santana - Smooth", 10, 16);

		System.out.println("\nTest 2 (Valid) Input: \"The Clash - Should I Stay or Should I Go\", 13 to 39");
		System.out.println("Expected: Should I Stay or Should I Go");
		System.out.println("Actual:");
		question_d("The Clash - Should I Stay or Should I Go", 13, 39);

		System.out.println("\nTest 3 (Error: Negative Start) Input: \"The Clash - Rock the Casbah\", -2 to 9");
		System.out.println("Expected: Error: Invalid start (-2) or end (9) index.");
		System.out.println("Actual:");
		question_d("The Clash - Rock the Casbah", -2, 9);

		System.out.println("\nTest 4 (Error: End Out of Bounds) Input: \"Santana - Samba Pa Ti\", 3 to 30");
		System.out.println("Expected: Error: Invalid start (3) or end (30) index.");
		System.out.println("Actual:");
		question_d("Santana - Samba Pa Ti", 3, 30);

		System.out.println("\nTest 5 (Error: Start > End) Input: \"The Clash - London Calling\", 12 to 5");
		System.out.println("Expected: Error: Invalid start (12) or end (5) index.");
		System.out.println("Actual:");
		question_d("The Clash - London Calling", 12, 5);
	}
}