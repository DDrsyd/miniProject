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



class ProductAPISteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user set url endpoint create product")
	def setcreateproduct() {
		println("\n user set the endpoint")
	}

	@When("user send request create product")
	def reqcreateproduct() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/New_Product'))
	}

	@Then("user got valid response create product")
	def verifyApicreateproduct() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}

	@Given("user set url endpoint get all product")
	def setgetallproduct() {
		println("\n user set the endpoint")
	}

	@When("user send request get all product")
	def reqgetallproduct() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/All_Products'))
	}

	@Then("user got valid response get all product")
	def verifyApigetallproduct() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}

	@Given("user set url endpoint get product by id")
	def setgetproductbyid() {
		println("\n user set the endpoint")
	}

	@When("user send request get product by id")
	def reqgetproductbyid() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/Product_Id'))
	}

	@Then("user got valid response get product by id")
	def verifyApiproductbyid() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}

	@Given("user set url endpoint delete product")
	def setgetdelbyid() {
		println("\n user set the endpoint")
	}

	@When("user send request delete product")
	def reqgetdelbyid() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/2. Product/Delete_Product'))
	}

	@Then("user got valid response delete product")
	def verifyApidelbyid() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}
}