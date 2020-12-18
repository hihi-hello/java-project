/*
 *WordBook.java
 *�ܾ����� ����� ������ Class
 *�ۼ��� �迵��
 *wordList: �ܾ� ��ϵ��� ������ ����Ʈ ����
 *input(String word): �Է� �ܾ �о�� ��,
 *�ܾ��忡 �̹� �����ϴ� �ܾ��� ����, �ƴ϶�� �ܾ��忡 ���� �߰�.
 *ArrayList<String> getList(): �ܾ� ����� ������ ����Ʈ�� ���ʰ��� ��ȯ.
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