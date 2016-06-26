package edu.pdx.cs410J.songqian;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class StudentTest
{

  @Test
  public void studentNamedPatIsNamedPat() {
    String name = "Pat";
    Student pat = createStudentContainsName(name); //given
    assertThat(pat.getName(), equalTo(name)); //when and then
  }

  @Test
  public void studentDescriptionContainsName() {
    String name = "Pat";
    Student student = createStudentContainsName(name);
    assertThat(student.toString(), containsString(name));
  }

  private Student createStudentContainsName(String name) {
    return new Student(name, new ArrayList(), 0.0, "Doesn't matter");
  }


}
