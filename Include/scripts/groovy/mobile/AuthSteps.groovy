package mobile
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AuthSteps {

	@Given("user navigate to mobile register page")
	def navRegMobile() {
		Mobile.startApplication('F:\\2022\\Test_Katalon\\miniProject\\app-release.apk', false)

		Mobile.tap(findTestObject('Mobile/android.widget.Icon_Login'), 0)

		Mobile.tap(findTestObject('Mobile/android.widget.ButtonToRegis'), 0)
	}

	@When("user type the register (.*), (.*), (.*)")
	def registerData(String fullname, email, password) {
		Mobile.tap(findTestObject('Mobile/register/android.widget.EditText - Alex Under, Fullname (1)'), 5)

		Mobile.setText(findTestObject('Mobile/register/android.widget.EditText - Alex Under, Fullname (1)'), fullname, 5)

		Mobile.tap(findTestObject('Mobile/android.widget.EditText - alexemail.com, Email'), 0)

		Mobile.setText(findTestObject('Mobile/android.widget.EditText - alexemail.com, Email'), email, 0)

		Mobile.tap(findTestObject('Mobile/android.widget.EditText - 123123123, Password'), 0)

		Mobile.setText(findTestObject('Mobile/android.widget.EditText - 123123123, Password'), password, 0)
	}

	@And("user click register button")
	def clickButtonRegister() {
		Mobile.tap(findTestObject('Mobile/android.widget.ButtonReg'), 0)
	}

	@Then("I verify the register")
	def verifyRegApp() {
		Mobile.verifyElementVisible(findTestObject('Mobile/android.widget.Icon_Login'), 0)
	}


	@Given("user navigate to mobile login page")
	def navLogMobile() {
		Mobile.startApplication('F:\\2022\\Test_Katalon\\miniProject\\app-release.apk', false)

		Mobile.tap(findTestObject('Mobile/android.widget.Icon_Login'), 0)
	}

	@When("user type the login (.*), (.*)")
	def loginData(String emaillogin, passwordlogin) {

		Mobile.tap(findTestObject('Mobile/android.widget.EditText - Email'), 5)

		Mobile.setText(findTestObject('Mobile/android.widget.EditText - Email'), emaillogin, 5)

		Mobile.tap(findTestObject('Mobile/android.widget.EditText - Password'), 5)

		Mobile.setText(findTestObject('Mobile/android.widget.EditText - Password'), passwordlogin, 0)
	}

	@And("user click login button on mobile")
	def clickButtonLogin() {
		Mobile.tap(findTestObject('Mobile/android.widget.Button_Login'), 5)
	}

	@Then("I verify the login")
	def verifyLogApp() {
		Mobile.verifyElementText(findTestObject('Mobile/android.widget.Icon_Login'), '')
	}

	@Given("user login on mobile auth")
	def loginMobileAuth() {
		Mobile.startApplication('F:\\2022\\Test_Katalon\\miniProject\\app-release.apk', false)

		Mobile.tap(findTestObject('Mobile/android.widget.Icon_Login'), 0)

		Mobile.tap(findTestObject('Mobile/android.widget.EditText - Email'), 0)

		Mobile.setText(findTestObject('Mobile/android.widget.EditText - Email'), 'DD@gmail.com', 0)

		Mobile.tap(findTestObject('Mobile/android.widget.EditText - Password'), 0)

		Mobile.setText(findTestObject('Mobile/android.widget.EditText - Password'), 'DD123', 0)

		Mobile.tap(findTestObject('Mobile/android.widget.Button_Login'), 0)

		Mobile.verifyElementText(findTestObject('Mobile/android.widget.Icon_Login'), '')
	}

	@When("user click on logout")
	def clickLogoutMobile() {
		Mobile.tap(findTestObject('Mobile/android.widget.Icon_Login'), 5)
	}

	@Then("user verify the logout")
	def verifylogoutMobile() {
		Mobile.verifyElementVisible(findTestObject('Mobile/android.widget.Icon_Login'), 0)
	}
}
