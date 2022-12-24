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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://frontliner.intermediatech.id/')

WebUI.setEncryptedText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_Password_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Password_btn btn-sm btn-icon position-_28d309'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_Password_password_1'), '12345678')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Sumber Data'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/th_Nasabah'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/select_102550100'), '50', true)

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'tessa')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_tessa'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/path'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'regina')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_Marketing Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'tes3')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_tes3'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_tes3'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/div_List Nasabah_card-title'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'war')

WebUI.doubleClick(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_warren'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.doubleClick(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    '')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Sumber Data'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'camer')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_Cameron Ball'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'tes3')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_tes3'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Filter'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'gladis')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_gladis'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/svg'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Semua'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/span_Select option'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'putr')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_putri'))

WebUI.setText(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/input_List Nasabah_form-control form-contro_b66241'), 
    'are')

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_arey'))

WebUI.click(findTestObject('Object Repository/Manager/Dashboard/Warm/filter/td_Customer Service'))

WebUI.closeBrowser()

