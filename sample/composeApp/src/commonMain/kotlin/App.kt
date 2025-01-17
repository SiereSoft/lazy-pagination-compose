import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.lazyColumn.PaginatedLazyColumnSampleContent
import ui.lazyRow.PaginatedLazyRowSampleContent

@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold(
            topBar = { TopBar() }
        ) {
            PaginatedLazyColumnSampleContent(
                modifier = Modifier.padding(it)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    Column {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    "Lazy Pagination - Compose Multiplatform",
                    fontWeight = FontWeight.Bold
                )
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors()
                .copy(containerColor = MaterialTheme.colors.surface)
        )
        HorizontalDivider()
    }
}

