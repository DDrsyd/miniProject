package restAPI
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



class RatingAPISteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user set url endpoint post rating")
	def setcreaterating() {
		println("\n user set the endpoint")
	}

	@When("user send request post rating")
	def reqcreaterating() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/Product_Rating'))
	}

	@Then("user got valid response post rating")
	def verifyApicreaterating() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}

	@Given("user set url endpoint get rating")
	def setgetallrating() {
		println("\n user set the endpoint")
	}

	@When("user send request get rating")
	def reqgetallrating() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/Get_Product_Ratings'))
	}

	@Then("user got valid response get rating")
	def verifyApigetallrating() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}
	
	@Given("user set url endpoint create comment")
	def setcreatecomment() {
		println("\n user set the endpoint")
	}

	@When("user send request create comment")
	def reqcreatecomment() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/Create_Comment'))
	}

	@Then("user got valid response create comment")
	def verifyApicreatecomment() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}

	@Given("user set url endpoint get comment")
	def setgetallcomment() {
		println("\n user set the endpoint")
	}

	@When("user send request get comment")
	def reqgetallcomment() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/Product_Comment'))
	}

	@Then("user got valid response get comment")
	def verifyApigetallcomment() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}
}