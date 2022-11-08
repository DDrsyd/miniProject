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



class CategoryAPISteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user set url endpoint create category")
	def setcreatecategory() {
		println("\n user set the endpoint")
	}

	@When("user send request create category")
	def reqcreatecategory() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/3. Category/Create_Category'))
	}

	@Then("user got valid response create category")
	def verifyApicreatecat() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}

	@Given("user set url endpoint get all category")
	def setgetallcategory() {
		println("\n user set the endpoint")
	}

	@When("user send request get all category")
	def reqgetallcategory() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/3. Category/Get_All_Category'))
	}

	@Then("user got valid response get all category")
	def verifyApigetallcategory() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}

	@Given("user set url endpoint get category by id")
	def setgetcategorybyid() {
		println("\n user set the endpoint")
	}

	@When("user send request get category by id")
	def reqgetcategorybyid() {
		println("\n user send request")
		GlobalVariable.global = WS.sendRequestAndVerify(findTestObject('API/3. Category/Category_By_Id'))
	}

	@Then("user got valid response get category by id")
	def verifyApigetcategorybyid() {
		println("\n user verify response")
		WS.verifyResponseStatusCode(GlobalVariable.global, 200)

		WS.verifyResponseStatusCodeInRange(GlobalVariable.global, 200, 201)
	}
}