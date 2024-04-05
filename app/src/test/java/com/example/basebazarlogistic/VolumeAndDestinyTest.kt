//import android.app.Activity
//import com.example.basebazarlogistic.calculators.VolumeAndDestiny
//import com.example.basebazarlogistic.ui.Buttons
//import com.example.basebazarlogistic.ui.TextViews
//import org.junit.Assert.assertEquals
//import org.junit.Test
//import org.mockito.Mock
//import org.mockito.Mockito.doReturn
//import org.mockito.Mockito.`when`
//import org.mockito.MockitoAnnotations
//
//class VolumeAndDestinyTest {
//
//    @Mock
//    private lateinit var activityMock: Activity
//
//    @Mock
//    private lateinit var buttonsMock: Buttons
//
//    @Mock
//    private lateinit var textViewsMock: TextViews
//
//    private lateinit var volumeAndDestiny: VolumeAndDestiny
//
//    @Test
//    fun testCalculateVolume() {
//        MockitoAnnotations.initMocks(this)
//        volumeAndDestiny = VolumeAndDestiny(activityMock)
//
//        doReturn("2").`when`(buttonsMock.lengthButton).text
//        doReturn("3").`when`(buttonsMock.widthButton).text
//        doReturn("4").`when`(buttonsMock.heightButton).text
//
//
//        volumeAndDestiny.calculateVolume()
//
//        assertEquals("Volume calculated incorrectly", "24.00000", textViewsMock.volumeText.text)
//    }
//
//    @Test
//    fun testCalculateDestiny() {
//        MockitoAnnotations.initMocks(this)
//        volumeAndDestiny = VolumeAndDestiny(activityMock)
//
//        doReturn("24.0" as CharSequence).`when`(textViewsMock.volumeText).text
//        doReturn("6" as CharSequence).`when`(buttonsMock.oneBoxWeightButton).text
//
//        volumeAndDestiny.calculateDestiny()
//
//        assertEquals("Destiny calculated incorrectly", "0.25000", textViewsMock.destinyText.text)
//    }
//}
