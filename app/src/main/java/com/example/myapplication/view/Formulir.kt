package com.example.myapplication.view

import androidx.compose.ui.Modifier

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki", "Perempuan"),
    onSubmitBtnClick: () -> Unit
){
    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(
                title = {Text(text = stringResource(id=R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.real_700)
                )
            )
        }
    ){ isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(tp = 20.dp)
                    .width(width = 250.dp),
                label= {Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
            HorizontalDivider(modifier = Modifier
                .padding(all = 20.dp)
                .width(width = 250.dp), thickness = Thickness,color = Color.Red)
            Row{
                jenisK.forEach{
                    item->
                    Row(verticalAlignment = Alignment.CenterVertically){
                        RdioButtom(
                            selected = false,
                            onClick = {item}
                        )
                        Text(text = item)
                    }
                }
            }
            HorizontalDivider(modifier = Modifier
                .padding(all = 20.dp)
                .width(width = 250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            OutlinedTextField(
                value = "",
                singleLine = true,
                modfier = Modifier
                    .width(width = 250.dp),
                label = {Text(text = "Alamat")},
                onValueChange ={},
            )
            Spacer(mmodifier = Modifier.height(height = 30.dp))
        }
    }
}