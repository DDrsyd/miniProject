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



class RatingSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user login and open rating")
	def userlogRat() {
		println ("\n")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')

		WebUI.click(findTestObject('Object Repository/Web/Login/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))

		WebUI.setText(findTestObject('Object Repository/Web/Login/Page_frontend-web/input_Email_input-480'), 'DD@gmail.com')

		WebUI.setText(findTestObject('Object Repository/Web/Login/Page_frontend-web/input_Password_input-483'), 'DD123')

		WebUI.click(findTestObject('Object Repository/Web/Login/Page_frontend-web/span_Login'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Web/Login/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'),
				0)
	}

	@When("user click product")
	def clickProductDet() {
		println ("\n")
		WebUI.click(findTestObject('Object Repository/Web/Rating/Page_frontend-web/span_Detail'))
	}

	@And("user click button rating")
	def ClickButrat() {
		println ("\n")
		WebUI.click(findTestObject('Object Repository/Web/Rating/Page_frontend-web/button_gaming_v-icon notranslate v-icon--li_4f0478'))
	}


	@Then("I verify the rating")
	def verifyRatingy() {
		println ("\n")
		WebUI.verifyElementPresent(findTestObject('Object Repository/Web/Rating/Page_frontend-web/div_(4)'), 0)
	}
}