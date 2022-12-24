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

WebUI.setText(findTestObject('Object Repository/Finance Service/edit/input_Email_email'), 'FinanceServies1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Finance Service/edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Finance Service/edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Finance Service/edit/input_Alamat_address'), 'Ranggeh pohgading')

WebUI.setText(findTestObject('Object Repository/Finance Service/edit/input_Email_email (1)'), 'mursida@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih                               _646bbc'), 
    'PNS', true)

WebUI.click(findTestObject('Object Repository/Finance Service/edit/input_Nama Perusahaan_company_name'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih Jabatan                       _8df9f8'), 
    'KOMISARIS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih Pendapatan                    _b78417'), 
    'Rp5.000.000 sampai Rp10.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih Jenis Layanan                 _600fd5'), 
    'multiguna', true)

WebUI.click(findTestObject('Object Repository/Finance Service/edit/input_Kategori_potential_category'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/a_Edit_1'))

WebUI.setText(findTestObject('Object Repository/Finance Service/edit/input_Nomor Whatsapp_whatsapp'), '0863463454')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih                               _646bbc'), 
    'SWASTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih Pendapatan                    _b78417'), 
    'Rp5.000.000 sampai Rp10.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih Jenis Layanan                 _600fd5'), 
    'multimanfaat', true)

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/input_Kategori_potential_category'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih                               _d968f3'), 
    'badan_usaha', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/edit/input_Nama Perusahaan_company_name'), 'regaksa')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/edit/select_Pilih Jabatan                       _8df9f8'), 
    'DIREKTUR', true)

WebUI.click(findTestObject('Object Repository/Finance Service/edit/button_Submit                              _00b7a5'))

WebUI.closeBrowser()

