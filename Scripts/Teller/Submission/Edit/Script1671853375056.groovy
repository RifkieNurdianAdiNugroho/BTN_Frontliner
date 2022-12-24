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

WebUI.setText(findTestObject('Object Repository/Teller/edit/input_Email_email'), 'teller@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Teller/edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Teller/edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Teller/edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Teller/edit/span_Submission'))

WebUI.click(findTestObject('Object Repository/Teller/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Teller/edit/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/edit/select_Pilih Kategori                      _92321f'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/edit/select_Pilih Tipe                          _9c5040'), 
    'personal', true)

WebUI.setText(findTestObject('Object Repository/Teller/edit/input_Nomor Telepon_phone'), '082352354')

WebUI.click(findTestObject('Object Repository/Teller/edit/input_Nomor Whatsapp_whatsapp'))

WebUI.setText(findTestObject('Object Repository/Teller/edit/input_Nomor Whatsapp_whatsapp'), '082345253')

WebUI.setText(findTestObject('Object Repository/Teller/edit/input_Email_email (1)'), 'irma@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/edit/select_Pilih Pendapatan                    _0b72eb'), 
    'Rp10.000.000 sampai Rp25.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/edit/select_Pilih Jenis Layanan                 _b268aa'), 
    'tarik_tunai', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teller/edit/select_Pilih Jenis Layanan                 _b268aa'), 
    'setor_tunai', true)

WebUI.setText(findTestObject('Object Repository/Teller/edit/input_Jenis Layanan_amount'), '2434553')

WebUI.click(findTestObject('Object Repository/Teller/edit/input_Pembiayaan_potential_category'))

WebUI.setText(findTestObject('Object Repository/Teller/edit/textarea_tes'), 'setor')

WebUI.click(findTestObject('Object Repository/Teller/edit/button_Submit                              _00b7a5'))

WebUI.closeBrowser()

