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



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user navigate to the login page")
	def navlogpage() {
		println("\n i'm in website")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')

		WebUI.click(findTestObject('Object Repository/Web/Login/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))
	}

	@When("user input (.*) and (.*)")
	def inputdata(String email, password) {
		println("\n i'm in website")
		println("\n i'm in website"+email)
		println("\n i'm in website"+password)

		WebUI.setText(findTestObject('Object Repository/Web/Login/Page_frontend-web/input_Email_input-480'), email)

		WebUI.setText(findTestObject('Object Repository/Web/Login/Page_frontend-web/input_Password_input-483'), password)
	}
	@And("user click login button")
	def clicklogin() {
		println("\n i'm in website")
		WebUI.click(findTestObject('Object Repository/Web/Login/Page_frontend-web/span_Login'))
	}

	@Then("user verify profile icon")
	def verifyicon() {
		println("\n i'm in website")
		WebUI.verifyElementPresent(findTestObject('Object Repository/Web/Login/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'),
				0)

		WebUI.closeBrowser()
	}
}

