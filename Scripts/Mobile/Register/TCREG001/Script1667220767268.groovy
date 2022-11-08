import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('F:\\2022\\Test_Katalon\\miniProject\\app-release.apk', false)

Mobile.tap(findTestObject('Mobile/android.widget.Icon_Login'), 0)

Mobile.waitForElementPresent(findTestObject('Mobile/android.widget.Button_Login'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.ButtonToRegis'), 0)

not_run: Mobile.tapAtPosition(612, 864)

Mobile.tap(findTestObject('Mobile/register/android.widget.EditText - Alex Under, Fullname (1)'), 0)

Mobile.setText(findTestObject('Mobile/register/android.widget.EditText - Alex Under, Fullname (1)'), 'Dwina', 0)

Mobile.tap(findTestObject('Mobile/android.widget.EditText - alexemail.com, Email'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText - alexemail.com, Email'), 'Dwina@mail.com', 0)

Mobile.tap(findTestObject('Mobile/android.widget.EditText - 123123123, Password'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText - 123123123, Password'), 'DW123', 0)

Mobile.tap(findTestObject('Mobile/android.widget.ButtonReg'), 0)

Mobile.verifyElementVisible(findTestObject('Mobile/android.widget.Icon_Login'), 0)

