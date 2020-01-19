import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(ImportantTests.class)
@SuiteClasses({ TestCaseEmployeeMethods.class })
public class AllImportantTests {

}