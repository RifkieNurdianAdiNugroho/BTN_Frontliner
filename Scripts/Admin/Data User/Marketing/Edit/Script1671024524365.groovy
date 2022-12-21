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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/span_Marketing'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/span_funding_svg-icon svg-icon-5 m-0'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/label_Edit Foto_btn btn-icon btn-circle btn_caf665'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/div_DashboardDataUserManagerTellerFinancing_85215a'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Nama_name'), 'tesfunding')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Nomor Telepon_phone'), '08235235')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Password_password (1)'), 'h7EXe+EbH6w=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/select_Funding                             _2f5e77'), 
    'financing', true)

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/span_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Nama_name'), 'fundingtes13')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/div_Nomor Telepon'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Nomor Telepon_phone'), '082345234234')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Password_password (1)'), 'NQl0svJ8VWc=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/select_Funding                             _2f5e77'), 
    'financing', true)

WebUI.doubleClick(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/i_Edit Foto_bi bi-x fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Nama_name'), 'fundingtes141414')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Nomor Telepon_phone'), '0843242345')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/input_Password_password (1)'), 'h7EXe+EbH6w=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/span_Password_btn btn-sm btn-icon position-_28d309'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/select_Funding                             _2f5e77'), 
    'financing', true)

WebUI.click(findTestObject('Object Repository/Admin/Data User/Marketing/Edit/span_Save'))

WebUI.closeBrowser()

