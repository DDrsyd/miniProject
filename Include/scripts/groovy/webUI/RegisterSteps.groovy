package webUI
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



class RegisterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user navigate to the page")
	def navtopage() {
		println ("\n")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("user navigate loginpage")
	def navtologin() {
		println ("\n")
		WebUI.click(findTestObject('Object Repository/Web/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
	}
	@And("user click register")
	def clickreg() {
		println ("\n")
		WebUI.click(findTestObject('Object Repository/Web/Page_frontend-web/a_Register'))
	}
	@And("user input the (.*),(.*),(.*)")
	def inputdata(String name, email, password) {
		println ("\n I'm input the data")
		println ("\n name : "+name)
		println ("\n email : "+email)
		println ("\n password : "+password)
		WebUI.setText(findTestObject('Object Repository/Web/Page_frontend-web/input_Nama Lengkap_input-301'), name)

		WebUI.setText(findTestObject('Object Repository/Web/Page_frontend-web/input_Email_input-304'), email)

		WebUI.setText(findTestObject('Object Repository/Web/Page_frontend-web/input_Password_input-307'), password)
	}

	@Then("user click button")
	def clickdata() {
		println ("\n")
		WebUI.click(findTestObject('Object Repository/Web/Page_frontend-web/span_Register'))
		WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_frontend-web/div_Login'), 'Login')

		WebUI.closeBrowser()
	}
}