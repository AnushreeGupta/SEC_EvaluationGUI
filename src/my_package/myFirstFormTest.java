import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;


public class myFirstFormTest {

  private DataPage instance;

  @Test
  public void allZeroMarks() {
	int teamMembers = 3;
	int [][] marks = {{1,2,3},{2,4,5},{4,4,5}};
	
	System.out.println(teamMembers);
	System.out.println(marks[0][0]);
	
	double[] normMarks = instance.calculateNormalizedMarks(marks, teamMembers);
	System.out.println(normMarks[0]);
	
	assertNotNull(normMarks);
	
	double sum = 0;
	  for(int i = 0; i < normMarks.length; i++){
		  sum = sum + normMarks[i];
	  }
	  
	  if(sum == 1.0){
		  System.out.println(true);
	  }else{
		  System.out.println(false);
	  }
	
  }


}

