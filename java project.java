/*
 *WordBook.java
 *단어장의 기능을 구현한 Class
 *작성자 김영현
 *wordList: 단어 목록들을 저장할 리스트 변수
 *input(String word): 입력 단어를 읽어온 후,
 *단어장에 이미 존재하는 단어라면 삭제, 아니라면 단어장에 새로 추가.
 *ArrayList<String> getList(): 단어 목록을 저장한 리스트의 참초값을 반환.
*/

package llplayer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WordBook {
	private ArrayList<String> wordList = new ArrayList<String>();
	
	
	void input(String word) {
		if(wordList.indexOf(word) == -1) wordList.add(word);
		else wordList.remove(word);
	}
	
	public ArrayList<String> getList(){
		return wordList;
	}
}