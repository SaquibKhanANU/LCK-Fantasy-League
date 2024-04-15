
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter

/**
 * Composable function to display an image using Image component.
 *
 * @param imageUrl The URL of the image to be loaded.
 * @param imageLoader The ImageLoader instance to use for loading the image.
 * @param contentDescription The content description for accessibility.
 */
@Composable
fun ImageComponent(
    imageUrl: String,
    imageLoader: ImageLoader,
    contentDescription: String,
    modifier: Modifier
) {
    // Use Coil's Image component with rememberAsyncImagePainter for asynchronous image loading
    Image(
        painter = rememberAsyncImagePainter(model = imageUrl, imageLoader = imageLoader),
        contentDescription = contentDescription,
        modifier = modifier
    )
}